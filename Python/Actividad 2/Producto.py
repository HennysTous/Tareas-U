class producto:
    
    def __init__(self):
        self.__codigo = 0
        self.__detalle = ""
        self.__valor_unitario = 0
        self.__unidades = 0
        self.__valor_neto=0

    def get_codigo(self):
        return self.__codigo
    
    def set_codigo(self, codigo):
        self.__codigo = codigo
    
    def get_detalle(self):
        return self.__detalle

    def set_detalle(self, detalle):
        self.__detalle = detalle

    def get_valor_unitario(self):
        return self.__valor_unitario

    def set_valor_unitario(self, valorU):
        self.__valor_unitario = valorU
    
    def get_unidades(self):
        return self.__unidades
    
    def set_unidades(self, uni):
        self.__unidades = uni
    
    def obtener_valor_neto(self):
        self.__valor_neto = self.__valor_unitario * self.__unidades
        return self.__valor_neto
    
    def producto_dict(self):
        prod = {
            "Codigo" : self.__codigo,
            "Detalle" : self.__detalle,
            "Valor Unitario" : self.__valor_unitario,
            "Unidades" : self.__unidades,
            "Valor Neto" : self.obtener_valor_neto()
        }
        return prod
    