package net.smallyu.java.designpattern.state.cases1;

public class Lift implements ILift {
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch(this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.openWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                // do something
                break;
            case STOPPONG_STATE:
                break;
        }
    }

    @Override
    public void close() {
        // 电梯在什么状态下可以关闭
        switch(this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                // do something
                break;
            case RUNNING_STATE:
                // do something
                break;
            case STOPPONG_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch(this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.runWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPONG_STATE:
                this.runWithoutLogic();
                this.setState(CLOSING_STATE);
        }
    }

    @Override
    public void stop() {
        switch(this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case STOPPONG_STATE:
                break;
        }
    }
    private void closeWithoutLogic() {
        System.out.println("关闭");
    }
    private void openWithoutLogic() {
        System.out.println("开启");
    }
    private void runWithoutLogic() {
        System.out.println("运行");
    }
    private void stopWithoutLogic() {
        System.out.println("停止");
    }
}
