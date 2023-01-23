from Empleado import empleado as empbase

class empleado_comision(empbase):
    
    __salariobase=1000000
    
    def __init__(self):
        self.__nombre=""
        self.__acumuladocomisiones=0
        self.__salariototal=0
    
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre=nombre

    def get_salariobase(self):
        return self.__salariobase

    def get_acumuladocomisiones(self):
        return self.__acumuladocomisiones
    
    def set_acumuladocomisiones(self, acumuladocomisiones):
        self.__acumuladocomisiones=acumuladocomisiones
    
    def get_salariototal(self):
        return self.__salariototal
    
    def set_salariototal(self, salariototal):
        self.__salariototal=salariototal

    def calcular_salario(self, acumuladocomisiones):
        salariototal=0
        if acumuladocomisiones > self.__salariobase:
            salariototal = self.__salariobase + 100000
        else:
            salariototal = self.__salariobase

        self.__salariototal = salariototal