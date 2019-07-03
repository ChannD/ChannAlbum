package com.chann.album.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "img_file")
@Data
@NoArgsConstructor
public class ImgFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;

    @ManyToOne(optional=true)
    @JoinColumn(name="photo_album_id",nullable=true)
    private PhotoAlbum photoAlbum;

    private String fileName;

    /**
     * 原始文件名
     */
    private String initialFileName;

    /**
     * 入库文件名
     */
    private Integer fileSource;

    /**
     * 备注
     */
    private String fileRemark;

    private String filePath;

    private float fileSize;

    private Date insertTime;
    private Date updateTime;
}
