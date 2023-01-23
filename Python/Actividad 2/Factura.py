from Cliente import cliente
from Producto import producto
import tabulate

class factura():

#Constructor
    def __init__(self):
        self.__num_factura = 0
        self.__nit = 0
        self.__razon_social = 0
        self.__cliente = {}
        self.__productos = []
        self.__costetotal = 0

#Region getter y setter    
    def get_numero_factura(self):
        return self.__num_factura
    
    def set_num_factura(self, numfact):
        self.__num_factura = numfact
    
    def get_nit(self):
        return self.__nit
    
    def set_nit(self, __nit):
        self.__nit = __nit
    
    def get_razon_social(self):
        return self.__razon_social
    
    def set_razon_social(self, razsoc):
        self.__razon_social = razsoc

#Metodos extras    
    def añadir_cliente(self, cli):
        self.__cliente = cli

    def añadir_producto(self, prod):
        self.__productos.append(prod)

    def calcular_coste_total(self):
        costetotal=0
        for i in range(0, len(self.__productos)-1):           
            valor_producto = self.__productos[i].get("Valor Neto")
            costetotal += valor_producto
        self.__costetotal = costetotal 

    def imprimir_factura(self):
        
        print(self.__num_factura)
        print(self.__nit)
        print(self.__razon_social)
        print(self.__cliente)

        for prod in self.__productos:
            print(prod)
        
        print(self.__productos)
        print(self.__costetotal)
    