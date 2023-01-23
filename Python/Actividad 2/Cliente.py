class cliente:
    
    def __init__(self):
        self.__identificacion = 0
        self.__nombre = ""
        self.__direccion = ""
        self.__telefono = 0
        self.__tipo_persona = ""
        

    def get_identificacion(self):
        return self.__identificacion
    
    def set_identificacion(self, identificacion):
        self.__identificacion = identificacion
    
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_direccion(self):
        return self.__direccion

    def set_direccion(self, dir):
        self.__direccion = dir
    
    def get_telefono(self):
        return self.__telefono
    
    def set_telefono(self, telf):
        self.__telefono = telf
    
    def set_tipo_persona(self, tipop):
        self.__tipo_persona = tipop

    def get_tipo_persona(self):
        return self.__tipo_persona
    
    def cliente_dict(self):
        prod = {
            "Identificacion" : self.__identificacion,
            "Nombre" : self.__nombre,
            "Direccion" : self.__direccion,
            "Telefono" : self.__telefono,
            "Tipo persona" : self.__tipo_persona
        }
        return prod