from Pago import pago as pg

class pago_efectivo(pg):
    
    def __init__(self):
        self.__monto = 0

    def get_monto(self):
        return self.__monto
    
    def set_monto(self, mon):
        self.__monto = mon

    def mostrar_pago(self):

        print("Su metodo de pago elegido fue efectivo" 
        + "\n A continuacion se debera pagar un valor de ${} en caja".format(str(self.__monto)))