public class Main {
  public static void main(String[] args) {

    // 1. Implemente bloques try-catch (Java) o try-except (Python) para instanciar empleados con datos inválidos (ej. sueldo negativo) y capture las excepciones mostrando sus mensajes por consola.
    try {
      new Empleado("Juan", -500);
    } catch (StringException | EnteroPositivoException e) {
      System.out.println("1. Error al crear empleado: " + e.getMessage());
    }

    try {
      new Empleado("Al", 1000);
    } catch (StringException | EnteroPositivoException e) {
      System.out.println("1. Error al crear empleado: " + e.getMessage());
    }

    // 2. Intente eliminar un empleado que no existe para forzar la captura de la NoEncontradoException.
    try {
      Empleado e3 = new Empleado("Maria", 2000);
      EmpleadoService.agregar(e3);
      EmpleadoService.eliminar("Pedro");
    } catch (StringException | EnteroPositivoException
        | CollectionVaciaException | NoEncontradoException e) {
      System.out.println("2. Error: " + e.getMessage());
    }

    // 3. Intente calcular el sueldo promedio de una lista vacía para comprobar la CollectionVaciaException.
    try {
      EmpleadoService.eliminar("Maria");
      EmpleadoService.sueldoPromedio();
    } catch (CollectionVaciaException | NoEncontradoException e) {
      System.out.println("3. Error: " + e.getMessage());
    }
  }
}