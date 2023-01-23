from Empleado import empleado as empbase
from EmpleadoFijo import empleado_fijo as empfijo
from EmpleadoComision import empleado_comision as empcomi


class main:
    
    nombre=input("Ingrese el nombre del empleado:\n")
    empleado = empbase(nombre)

    opt = int(input("El empleado es\n1) Fijo\n2) A comision\n"))
    match opt:
        case 1:
            empleadofijo=empfijo()
            empleadofijo.set_nombre(empleado.get_nombre())

            salario=int(input("Ingrese el salario del empleado\n"))
            empleadofijo.set_salariobase(salario)

            tiempo=int(input("Ingrese el tiempo que lleva el empleado en la empresa (años)\n"))
            empleadofijo.set_tiempo(tiempo)

            salariototal=empleadofijo.calcular_salario(empleadofijo.get_salariobase(), empleadofijo.get_tiempo())
            print("El empleado {} tiene un pago mensual de ${}".format(str(empleadofijo.get_nombre()), str(empleadofijo.get_salariototal())))
        
        case 2:
            empleadocomi=empcomi()
            empleadocomi.set_nombre(empleado.get_nombre())

            acumuladocomisiones=int(input("Ingrese el acumulado en comisiones que realizo el empleado\n"))
            empleadocomi.set_acumuladocomisiones(acumuladocomisiones)

            salariototal=empleadocomi.calcular_salario(empleadocomi.get_acumuladocomisiones())
            print("El empleado {} tiene un pago mensual de ${}".format(str(empleadocomi.get_nombre()), str(empleadocomi.get_salariototal())))
        
        case default:
            exit
    