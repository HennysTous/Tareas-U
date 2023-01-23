#Imports
from Cliente import cliente
from Factura import factura
from Producto import producto
from Pago import pago
from PagoDebito import pago_debito
from PagoCredito import pago_credito
from PagoEfectivo import pago_efectivo
import random


class main:
    
    #Datos de Factura
    fact = factura()
    fact.set_num_factura(random.randint(1000, 9999))
    fact.set_nit(random.randint(111111,999999))
    fact.set_razon_social(input("Cual es la razon social?\n"))

    #Datos de Cliente
    cli = cliente()
    cli.set_identificacion(random.randint(1111111, 9999999))
    cli.set_nombre("Hennys Sebastian Tous De Avila")
    cli.set_direccion("Villas de la Candelaria, Manzana 20 Lote 17")
    cli.set_telefono("6656721")
    cli.set_tipo_persona("Persona Natural")
    cliDict = cli.cliente_dict()
    fact.añadir_cliente(cliDict)

    #Datos de productos
    prod = producto()
    for i in range(0,3):
        prod.set_codigo(random.randint(1000,9999))
        prod.set_detalle(input("Cual es el producto?\n"))
        prod.set_unidades(random.randint(1,5))
        prod.set_valor_unitario(int(input("Cuanto cuesta ese producto?\n")))

        prodDict = prod.producto_dict()
        fact.añadir_producto(prodDict)

    #Se calcula el coste total    
    fact.calcular_coste_total()

    #Se instancia el pago y el monto
    pago = pago()
    pago.set_monto(fact.get_coste_total())
    
    #Se Elige cual metodo de pago usar
    opt=int(input("Le ofrecemos los siguientes metodos de pago:\nDebito: 1\nCredito: 2\nEfectivo: 3\nCual de estos metodos desea usar?\n"))
    match opt:
        case 1:
            pagodeb=pago_debito()
            pagodeb.set_monto(pago.get_monto())

            numdeb=int(input("Inserte el numero de su tarjeta Debito\n"))
            pagodeb.set_numdeb(numdeb)

            pagodeb.mostrar_pago()

        case 2:
            pagocred=pago_credito()
            pagocred.set_monto(pago.get_monto())

            numcred=int(input("Inserte el numero de su tarjeta Credito\n"))
            pagocred.set_numcred(numcred)

            codigo=int(input("Inserte el codigo de seguridad de su tarjeta Credito\n"))
            pagocred.set_codigo(codigo)

            
            cuotas=int(input("A cuantas cuotas quiere diferir el pago?\n"))
            pagocred.set_numero_cuotas(cuotas)

            pagocred.calculo_cuotas(pagocred.get_numero_cuotas(), pagocred.get_monto())
            pagocred.mostrar_pago()
        case 3:
            pagoefec=pago_efectivo()
            pagoefec.set_monto(pago.get_monto())
            pagoefec.mostrar_pago()

    
    
    fact.imprimir_factura()
    
    