from fastapi import FastAPI, status, HTTPException
from database import Base, engine
from sqlalchemy.orm import Session
import models, schemas

Base.metadata.create_all(engine)

app = FastAPI()

@app.get("/")
def root():
    return "Olá Mundo"

@app.post("/disciplina", status_code=status.HTTP_201_CREATED)
def create_disciplina(disciplina: schemas.disciplina):
    session = Session(bind=engine, expire_on_commit=False)
    disciplinamod = models.disciplina(  descricao = disciplina.descricao, 
                                        tipo = disciplina.tipo, 
                                        carga_horaria = disciplina.carga_horaria, 
                                        codigo = disciplina.codigo)
    session.add(disciplinamod)
    session.commit()
    id = disciplinamod.id
    
    session.close()

    return f"Created disciplina with id: {id}."

@app.get("/disciplina/{id}")
def read_disciplina(id: int):
    session = Session(bind=engine, expire_on_commit=False)
    disciplina = session.query(models.disciplina).get(id)
    
    session.close()

    if not disciplina:
        raise HTTPException(status_code=404, detail=f"Disciplina item with id: {id} was not found.")

    return disciplina

@app.put("/disciplinas/{id}")
def update_disciplina(  id: int, 
                        descricao: str, 
                        tipo: str, 
                        carga_horaria: int, 
                        codigo: int):
    session = Session(bind=engine, expire_on_commit=False)
    disciplina = session.query(models.disciplina).get(id)

    if disciplina:
        disciplina.descricao = descricao
        disciplina.tipo = tipo
        disciplina.carga_horaria = carga_horaria
        disciplina.codigo = codigo
        session.commit()
    session.close()

    if not disciplina:
        raise HTTPException(status_code=404, detail=f"disciplina with id: {id} was not found.")

    return disciplina

@app.delete("/disciplinas/{id}", status_code=status.HTTP_204_NO_CONTENT)
def delete_disciplina(id: int):
    session = Session(bind=engine, expire_on_commit=False)
    disciplina = session.query(models.disciplina).get(id)
    
    if disciplina:
        session.delete(disciplina)
        session.commit()
        session.close()
    else:
        raise HTTPException(status_code=404, detail=f"Disciplina with id: {id} was not found.")

    return None

@app.get("/disciplinas")
def read_disciplina_list():
    session = Session(bind=engine, expire_on_commit=False)
    disciplina_list = session.query(models.disciplina).all()

    session.close()

    return disciplina_list