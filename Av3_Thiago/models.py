from sqlalchemy import Column, Integer, String
from database import Base

class disciplina(Base):
    __tablename__ = 'disciplina'
    id = Column(Integer, primary_key=True)
    descricao = Column(String(256))
    tipo = Column(String(256))
    carga_horaria = Column(Integer)
    codigo = Column(Integer)