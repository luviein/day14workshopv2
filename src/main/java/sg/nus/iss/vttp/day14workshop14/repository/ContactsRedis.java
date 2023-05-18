package sg.nus.iss.vttp.day14workshop14.repository;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import jakarta.validation.Valid;
import sg.nus.iss.vttp.day14workshop14.model.Contact;

@Repository
public class ContactsRedis {

    public void saveContact(@Valid Contact contact, Model model) {
    }
    
}
