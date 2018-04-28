/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.crud.repository;

import modelo.crud.newpackage.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Paulina
 */

@Repository
public interface NoteRepository extends JpaRepository <Note, Long>{
    
}
