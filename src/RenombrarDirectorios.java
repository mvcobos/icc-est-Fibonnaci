import java.io.File;

public class RenombrarDirectorios {
    public void renombrarDirectorios(String path){
        // Validemos que el path sea un directorio
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path, no es un directorio valido");
            return;
        }
        //ACA vamos a cambiar los nombres
        System.out.println("La ruta path es valida");
        renombrarDirectoriosInternos(directorio);
    }

    public void renombrarDirectoriosInternos(File directorio){
        // Listar todos los archivos  y/o carpetas hijas
        File[] directoriosArchivosInternos = directorio.listFiles();
        if(directoriosArchivosInternos == null){
            return;
        }
        for(File directorioArchivo : directoriosArchivosInternos){
            if(directorioArchivo.isDirectory()){
                String nombreOriginal = directorioArchivo.getName();
                String nuevoNombre = "Nuevo-" + nombreOriginal;
                File nuevoDirectorio = new File(directorioArchivo.getParent(), nuevoNombre);
                if(directorioArchivo.renameTo(nuevoDirectorio)){
                    renombrarDirectoriosInternos(nuevoDirectorio);
                }
            }

        }
    }
}
