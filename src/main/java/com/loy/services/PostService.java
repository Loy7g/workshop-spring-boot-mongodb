package com.loy.services;


import com.loy.domain.Post;
import com.loy.repository.PostRepository;
import com.loy.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PostService {

    @Autowired
    private PostRepository repo;



    public Post findById(String id){
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public Post insert(Post obj) {
        return repo.insert(obj);
    }
}



