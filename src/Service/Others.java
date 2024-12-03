package Service;

import Repository.Clothes;
import Repository.ConsolesAndAccessories;
import Repository.Jewelry;
import Repository.Music;
import Repository.Videogames;

public class Others {
    public Clothes getClothesList() {
        return new Clothes();
    }

    public ConsolesAndAccessories getConsolesAndAccessoriesList() {
        return new ConsolesAndAccessories();
    }

    public Jewelry getJewelryList() {
        return new Jewelry();
    }

    public Music getMusicList() {
        return new Music();
    }

    public Videogames getVideogamesList() {
        return new Videogames();
    }
}