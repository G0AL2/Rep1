package com.facebook.react.modules.vibration;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import o6.a;

@SuppressLint({"MissingPermission"})
@a(name = VibrationModule.NAME)
/* loaded from: classes.dex */
public class VibrationModule extends NativeVibrationSpec {
    public static final String NAME = "Vibration";

    public VibrationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void cancel() {
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrate(double d10) {
        int i10 = (int) d10;
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(i10, -1));
        } else {
            vibrator.vibrate(i10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrateByPattern(ReadableArray readableArray, double d10) {
        int i10 = (int) d10;
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        long[] jArr = new long[readableArray.size()];
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            jArr[i11] = readableArray.getInt(i11);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createWaveform(jArr, i10));
        } else {
            vibrator.vibrate(jArr, i10);
        }
    }
}
