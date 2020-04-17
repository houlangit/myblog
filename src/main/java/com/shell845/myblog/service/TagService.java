package com.shell845.myblog.service;

import com.shell845.myblog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author ych
 * @date 16/4/2020 9:03 PM
 */
public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    Tag updateTag(Long id, Tag tag);

    void deleteTag(Long id);
}
