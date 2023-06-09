package com.example.pidev.Entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Client_Account")
public class ClientAccount implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idclient")
    private Integer IDClient ; // clé primaire
    private Float Solde ;
    private Boolean Subscription ;
    private String ExpirationDate ;
    private  Long rib;





//    @OneToMany(cascade = CascadeType.ALL, mappedBy="clientaccount")
//    private Set<LoanProject> loanproject;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy="clientaccount")
//    private Set<PartnershipProjects> partnershipproject;




}


