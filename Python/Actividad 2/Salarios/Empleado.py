class empleado:
    __nombre=""
    
    def __init__(self, nombre) -> None:
        self.__nombre = nombre
    
    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre=nombre
        

