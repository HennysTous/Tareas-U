class pago():
    
    def __init__(self):
        self.__montobase=0
    
    def get_monto(self):
        return self.__montobase
    
    def set_monto(self, monto):
        self.__montobase = monto
