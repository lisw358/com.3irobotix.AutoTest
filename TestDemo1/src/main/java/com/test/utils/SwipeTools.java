package com.test.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import java.time.Duration;


/**
 * 封装滑动类，公共方法，（类名.方法名）即可使用
 * 传入参数1： device（句柄）
 * 传入参数2： num（滑动次数）
 * 封装日期: 2018/7/19
 * 封装开发：lsw
 */
public class SwipeTools {

    // 公共类，持续时间，秒
    static Duration duration = Duration.ofSeconds(1);

    //触摸操作
    static TouchAction action;

    // 常量用于存放 高 和 宽，y 和 x
    static int width = 0;
    static int height = 0;

    // 上滑
    public static void swipeUp(AppiumDriver driver,int num) throws InterruptedException {

        // 获取x轴 和 y轴，x=width   y=height
        width = driver.manage().window().getSize().width;
        height = driver.manage().window().getSize().height;

        for (int i=0;i<num;i++) {
            action = new TouchAction(driver);                // 创建触摸操作对象，并传入一个句柄
            action.press(width / 2, height * 3 / 4);    // 动作，“按”起点
            action.waitAction(duration);                     // 动作，等待行动（上面定义了1秒）
            action.moveTo(width / 2, height / 4);       // 动作，“移动到/移至”
            action.release();                                // 动作，“松开/释放”
            action.perform();                                // 动作，“执行”
            Thread.sleep(1000);                        // 线程休眠，避免两次滑动相邻
        }
    }

    // 下滑
    public static void swipeDown(AppiumDriver driver, int num) throws InterruptedException {
        // 获取x轴 和 y轴，x=width   y=height
        width = driver.manage().window().getSize().width;
        height = driver.manage().window().getSize().height;

        for (int i=0;i<num;i++) {
            action = new TouchAction(driver);                     // 创建触摸操作对象，并传入一个句柄
            action.press(width / 2, height / 4);             // 动作，“按”起点
            action.waitAction(duration);                          // 动作，等待行动（上面定义了1秒）
            action.moveTo(width / 2, height * 3 / 4);        // 动作，“移动到/移至”
            action.release();                                     // 动作，“松开/释放”
            action.perform();                                     // 动作，“执行”
            Thread.sleep(1000);                              // 线程休眠，避免两次滑动相邻
        }
    }

    // 左滑
    public static void swipeLeft(AppiumDriver driver, int num) throws InterruptedException {
        // 获取x轴 和 y轴，x=width   y=height
        width = driver.manage().window().getSize().width;
        height = driver.manage().window().getSize().height;

        for (int i=0;i<num;i++) {
            action = new TouchAction(driver);                        // 创建触摸操作对象，并传入一个句柄
            action.press(width * 3 / 4 + 200, height / 2);      // 动作，“按”起点
            action.waitAction(duration);                             // 动作，等待行动（上面定义了1秒）
            action.moveTo(width / 4 - 200, height / 2);         // 动作，“移动到/移至”
            action.release();                                        // 动作，“松开/释放”
            action.perform();                                        // 动作，“执行”
            Thread.sleep(1000);                                 // 线程休眠，避免两次滑动相邻
        }
    }

    // 右滑
    public static void swipeRight(AppiumDriver driver,int num) throws InterruptedException {
        // 获取x轴 和 y轴，x=width   y=height
        width = driver.manage().window().getSize().width;
        height = driver.manage().window().getSize().height;

        for (int i=0;i<num;i++) {
            action = new TouchAction(driver);                        // 创建触摸操作对象，并传入一个句柄
            action.press(width / 4 - 200, height / 2);          // 动作，“按”，起点
            action.waitAction(duration);                             // 动作，等待行动（上面定义了1秒）
            action.moveTo(width * 3 / 4 + 200, height / 2);     // 动作，“移动到/移至”
            action.release();                                        // 动作，“松开/释放”
            action.perform();                                        // 动作，“执行”
            Thread.sleep(1000);                                 // 线程休眠，避免两次滑动相邻
        }
    }
}
