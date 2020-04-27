package ImageHoster.service;

import ImageHoster.model.Image;
import ImageHoster.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    //Call the getAllImages() method in the Repository and obtain a List of all the images in the database


    //The method calls the createImage() method in the Repository and passes the image to be persisted in the database


    //The method calls the getImageByTitle() method in the Repository and passes the title of the image to be fetched

    //The method calls the getImage() method in the Repository and passes the id of the image to be fetched

    //The method calls the updateImage() method in the Repository and passes the Image to be updated in the database

    //The method calls the deleteImage() method in the Repository and passes the Image id of the image to be deleted in the database

}
