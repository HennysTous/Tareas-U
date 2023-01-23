from Cliente import cliente
from Producto import producto


class factura():

#Constructor
    def __init__(self):
        self.__num_factura = 0
        self.__nit = 0
        self.__razon_social = ""
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

    def get_coste_total(self):
        return self.__costetotal

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

        ##Estructura del print e Informacion de componentes de la Factura
        info_factura=('\n{}'.format('Factura No: '+str(self.__num_factura)) 
        +'\t\t{}'.format('Nit: '+str(self.__nit)) 
        + '\t\t{}'.format('Razon Social: '+str(self.__razon_social)))
        
        info_cliente=('\n{}'.format('Identificacion: '+str(self.__cliente.get('Identificacion'))) + '\t\t\t{}'.format('Tipo Persona: '+str(self.__cliente.get('Tipo persona'))) 
        +'\n{}'.format('Nombre: '+str(self.__cliente.get('Nombre')))
        +'\n{}'.format('Direccion: '+str(self.__cliente.get('Direccion')))
        +'\n{}'.format('Telefono: '+str(self.__cliente.get('Telefono'))))

        info_producto=(('\n{}'.format("Codigo")) 
        +'\t\t{}'.format("Detalle") 
        +'\t\t{}'.format("Valor Unitario") 
        +'\t{}'.format("Unidad") 
        +'\t\t{}'.format("Subtotal"))

        info_valortotal=(('\n{}'.format("Total")) 
        +'\t\t\t\t\t\t\t\t${}'.format(str(self.__costetotal)))

        separacion = ('\n'+('='*
        (len(info_factura) + 1 + len('{}'.format('Razon Social: '+str(self.__razon_social))))
        ))

        ##Prints
        print(separacion)
        print(info_factura)

        print(separacion)
        print(info_cliente)

        print(separacion)
        print(info_producto)
        for prod in self.__productos:
            producto=(('\n{}'.format(str(prod.get('Codigo')))) 
            +'\t\t{}'.format(str(prod.get('Detalle'))) 
            +'\t\t${}'.format(str(prod.get('Valor Unitario'))) 
            +'\t\t{}'.format(str(prod.get('Unidades'))) 
            +'\t\t${}'.format(str(prod.get('Valor Neto'))))
            print(producto)
        
        print(separacion)
        print(info_valortotal)
        print(separacion)