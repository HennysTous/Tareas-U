from ast import match_case
from Pago import pago as pg
import time as t

class pago_credito(pg):
    
    def __init__(self):
        self.__numero_credito=0
        self.__monto = 0
        self.__numero_cuotas=0
        self.__cuota_mensual=0
        self.__codigo_verificacion=0

    #Getters y Setters
    def get_numcred(self):
        return self.__numero_credito
    
    def set_numcred(self, cred):
        self.__numero_credito = cred

    def get_monto(self):
        return self.__monto
    
    def set_monto(self, mon):
        self.__monto = mon

    def get_numero_cuotas(self):
        return self.__numero_cuotas
    
    def set_numero_cuotas(self, cuotas):
        self.__numero_cuotas = cuotas

    def get_cuota_mensual(self):
        return self.__cuota_mensual

    def set_cuota_mensual(self, cuotamens):
        self.__cuota_mensual = cuotamens

    def get_codigo(self):
        return self.__codigo_verificacion
    
    def set_codigo(self, codigo):
        self.__codigo_verificacion = codigo

    #Otros metodos
    def calculo_cuotas(self, cuotas, monto):
        intereses = 0.03
        cuota_mensual = (monto/cuotas)+(monto * intereses )
        self.__cuota_mensual = cuota_mensual
        

    def mostrar_pago(self):
        
        if self.__codigo_verificacion != 0:
            print("Su metodo de pago elegido fue credito" 
            +"\n A continuacion se efectuara una transaccion con valor de ${} en la cuenta No {}".format(str(self.__monto),str(self.__numero_credito))
            +"\n El numero de cuotas elegidos fue {}, por tanto, el valor a pagar mensualmente es igual a ${:.4f}".format(str(self.__numero_cuotas),(self.__cuota_mensual)))
        
            t.sleep(2)
       
            print("Su pago ha sido exitoso!")

        else:
            print("No hubo codigo de verificacion")
      