package Service;

import Repository.Appliances;
import Repository.Books;
import Repository.Fashion;
import Repository.Furniture;
import Repository.Home;
import Repository.Pets;
import Repository.Sports;
import Repository.Technology;
import Repository.Toys;

public class Function {

    public Appliances getAppliancesList() {
        return new Appliances();
    }

    public Books getBooksList() {
        return new Books();
    }

    public Fashion getFashionList() {
        return new Fashion();
    }

    public Furniture getFurnitureList() {
        return new Furniture();
    }

    public Home getHomeList() {
        return new Home();
    }

    public Pets getPetsList() {
        return new Pets();
    }

    public Sports getSportsList() {
        return new Sports();
    }

    public Technology getTechnologyList() {
        return new Technology();
    }

    public Toys getToysList() {
        return new Toys();
    }
}