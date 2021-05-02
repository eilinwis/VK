package domain;

public class CommentsInfo {
    private int count;
    private boolean Post;
    private boolean Like;
    private boolean Delete;
    private boolean Edit;
    private boolean AttachPhoto;
    private boolean AttachVideo;
    private boolean AttachAudio;
    private boolean AttachFile;
    private boolean AttachSticker;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isPost() {
        return Post;
    }

    public void setPost(boolean post) {
        Post = post;
    }

    public boolean isLike() {
        return Like;
    }

    public void setLike(boolean like) {
        Like = like;
    }

    public boolean isDelete() {
        return Delete;
    }

    public void setDelete(boolean delete) {
        Delete = delete;
    }

    public boolean isEdit() {
        return Edit;
    }

    public void setEdit(boolean edit) {
        Edit = edit;
    }

    public boolean isAttachPhoto() {
        return AttachPhoto;
    }

    public void setAttachPhoto(boolean attachPhoto) {
        AttachPhoto = attachPhoto;
    }

    public boolean isAttachVideo() {
        return AttachVideo;
    }

    public void setAttachVideo(boolean attachVideo) {
        AttachVideo = attachVideo;
    }

    public boolean isAttachAudio() {
        return AttachAudio;
    }

    public void setAttachAudio(boolean attachAudio) {
        AttachAudio = attachAudio;
    }

    public boolean isAttachFile() {
        return AttachFile;
    }

    public void setAttachFile(boolean attachFile) {
        AttachFile = attachFile;
    }

    public boolean isAttachSticker() {
        return AttachSticker;
    }

    public void setAttachSticker(boolean attachSticker) {
        AttachSticker = attachSticker;
    }
}
