from lib2to3.pgen2.token import GREATER
from Empleado import empleado as empbase

class empleado_fijo(empbase):
    
    def __init__(self):
        
        self.__nombre = ""
        self.__salariobase=0
        self.__tiempo=0
        self.__salariototal=0
    
    def get_nombre(self):
        return self.__nombre
    
    def set_tiempo(self, nombre):
        self.__nombre=nombre

    def get_salariobase(self):
        return self.__salariobase
    
    def set_salariobase(self, salariobase):
        self.__salariobase=salariobase

    def get_tiempo(self):
        return self.__tiempo
    
    def set_tiempo(self, tiempo):
        self.__tiempo=tiempo
    
    def get_salariototal(self):
        return self.__salariototal
    
    def set_salariototal(self, salariototal):
        self.__salariototal=salariototal

    def calcular_salario(self, salario, tiempo):
        salariototal=0
        if tiempo <= 2:
            salariototal = salario
        elif tiempo >= 2 and tiempo <= 3:
            salariototal = salario + (salario * 0.05)
        elif tiempo >= 4 and tiempo <= 7:
            salariototal = salario + (salario * 0.1)
        elif tiempo >= 8 and tiempo <= 15:
            salariototal = salario + (salario * 0.15)
        elif tiempo > 15:
            salariototal = salario + (salario * 0.20)
        self.__salariototal=salariototal
        
