from typing import Union
from fastapi import FastAPI

# To execute type uvicorn main:app –reload or python –m uvicorn main:app –reload 
app = FastAPI()

@app.get("/")
def read_root():
  return {"Hello": "World"}


@app.get("/temp/{board_name}")
def read_temp(board_name):
  temp = 22.2

  return {"board name {board_name} temperature {temp}"}