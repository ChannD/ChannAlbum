package com.chann.album.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "album_view_type")
@Data
@NoArgsConstructor
public class AlbumViewType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer id;

    private String viewTypeDesc;
}
