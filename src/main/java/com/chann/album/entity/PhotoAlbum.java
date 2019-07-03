package com.chann.album.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "photo_album")
@Data
@NoArgsConstructor
public class PhotoAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer id;

    private String albumName;

    @ManyToOne(optional=true)
    @JoinColumn(name="view_type_id",nullable=true)
    private AlbumViewType albumViewType;

    private String albumDesc;

    private Integer phontNum;

    private Integer diskEmploy;

    /**
     * 封面
     */
    private Integer photoFileId;

    private Date updateTime;
    private Date insertTime;
}
