from Cliente import cliente
from Factura import factura
from Producto import producto
import random
class main:

    fact = factura()
    fact.set_num_factura(random.randint(1000, 9999))
    fact.set_nit(random.randint(111111,999999))
    fact.set_razon_social(input("Cual es la razon social?"))


    cli = cliente()
    cli.set_identificacion(random.randint(1111111, 9999999))
    cli.set_nombre("Hennys Sebastian Tous De Avila")
    cli.set_direccion("Villas de la Candelaria, Manzana 20 Lote 17")
    cli.set_telefono("6656721")
    cli.set_tipo_persona("Persona Natural")
    cliDict = cli.cliente_dict()
    fact.añadir_cliente(cliDict)

    prod = producto()
    for i in range(0,3):
        prod.set_codigo(random.randint(1000,9999))
        prod.set_detalle(input("Cual es el producto?"))
        prod.set_unidades(random.randint(1,5))
        prod.set_valor_unitario(int(input("Cuanto cuesta ese producto?")))

        prodDict = prod.producto_dict()
        fact.añadir_producto(prodDict)
        
        
            
    fact.calcular_coste_total()
    fact.imprimir_factura()