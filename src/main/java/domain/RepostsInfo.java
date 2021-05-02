package domain;

public class RepostsInfo {
    private int repostCount;
    private boolean IsReposted;
    private int repostedList;

    public int getRepostCount() {
        return repostCount;
    }

    public void setRepostCount(int repostCount) {
        this.repostCount = repostCount;
    }

    public boolean isReposted() {
        return IsReposted;
    }

    public void setReposted(boolean reposted) {
        IsReposted = reposted;
    }

    public int getRepostedList() {
        return repostedList;
    }

    public void setRepostedList(int repostedList) {
        this.repostedList = repostedList;
    }

}
