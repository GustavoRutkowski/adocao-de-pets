import java.util.ArrayList;
import classes.Sistema;
import classes.entities.Administrador;
import classes.entities.Pet;
import classes.entities.Usuario;

public class Main {
    public static void main(String[] args) {
        Render.administradores();
        Render.pets();

        ArrayList<Administrador> admins = Sistema.administradores;
        for (int i = 0; i < admins.size(); i++) {
            Administrador admin = admins.get(i);

            admin.imprimirDados();
            System.out.println();
        };

        ArrayList<Pet> pets = Sistema.pets;
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);

            pet.imprimirDados();
            System.out.println();
        };

        ArrayList<Usuario> usuarios = Sistema.usuarios;
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);

            usuario.imprimirDados();
            System.out.println();
        };
    };
};
