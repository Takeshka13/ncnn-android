//С Богом

package com.takeshi.yolov8ncnn;

import android.content.res.AssetManager;
import android.view.Surface;

public class YOLOv8Ncnn
{
    public native boolean loadModel(AssetManager mgr, int taskid, int modelid, int cpugpu);
    public native boolean openCamera(int facing);
    public native boolean closeCamera();
    public native boolean setOutputWindow(Surface surface);

    static {
        System.loadLibrary("yolov8ncnn");
    }
}
