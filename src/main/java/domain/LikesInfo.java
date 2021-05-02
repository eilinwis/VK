package domain;

public class LikesInfo {
    private int likesCount;
    private boolean IsLiked;
    private int likedList;

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isLiked() {
        return IsLiked;
    }

    public void setLiked(boolean liked) {
        IsLiked = liked;
    }

    public int getLikedList() {
        return likedList;
    }

    public void setLikedList(int likedList) {
        this.likedList = likedList;
    }
}
