package com.hebin.arcchart;

/**
 * 增长的数字接口
 */
public interface IRiseNumber {
    /**
     * 开始播放动画的方法
     */
    void start();

    /**
     * 设置整数
     *
     * @param number
     * @return
     */
    void withNumber(int number);

    /**
     * 设置动画播放时长
     *
     * @param duration
     * @return
     */
    void setDuration(long duration);

}