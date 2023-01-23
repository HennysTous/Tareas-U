from Pago import pago as pg
import time as t

class pago_debito(pg):
    
    def __init__(self):
        self.__numero_debito=0
        self.__monto = 0

    def get_numdeb(self):
        return self.__numero_debito
    
    def set_numdeb(self, deb):
        self.__numero_debito = deb

    def get_monto(self):
        return self.__monto
    
    def set_monto(self, mon):
        self.__monto = mon

    def mostrar_pago(self):
        print("Su metodo de pago elegido fue debito" 
        + "\n A continuacion se efectuara una transaccion con valor de ${} en la cuenta No {}".format(str(self.__monto),str(self.__numero_debito)))
        
        t.sleep(2)
       
        print("Su pago ha sido exitoso!")
