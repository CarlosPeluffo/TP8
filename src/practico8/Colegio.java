package practico8;

public class Colegio {

    public static void main(String[] args) {
        Materia ingles=new Materia(1,"Inglés I", 1);
        Materia math=new Materia(2,"Matemáticas", 1);
        Materia lab1=new Materia(3,"Laboratorio I", 1);
        Alumno lopez=new Alumno(1001,"Martin", "Lopez");
        Alumno martinez=new Alumno(1002,"Brenda", "Martinez");
        lopez.agregarMateria(ingles);
        lopez.agregarMateria(math);
        lopez.agregarMateria(lab1);
        martinez.agregarMateria(ingles);
        martinez.agregarMateria(math);
        martinez.agregarMateria(lab1);
        martinez.agregarMateria(lab1);
        lopez.cantidadMaterias();
        martinez.cantidadMaterias();
        /* e) Tienen la misma cantidad de materias porque las colecciones 
        tipo set no admite elementos repetidos. Sobreescribiendo el método 
        equals para que una materia con el mismo id, nombre y año no se 
        agregen a la colección. 
        */
    }
    
}
