package com.mycompany.myapp.web.rest.dto;

/**
 * Created by thanh-anh-tuan on 21/03/2016.
 */
public class RequestMessageDTO {

    String content;
    boolean isPublic;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
}
