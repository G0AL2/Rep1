package c7;

import android.view.View;
import c7.h;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: AndroidSwitchManagerDelegate.java */
/* loaded from: classes.dex */
public class g<T extends View, U extends com.facebook.react.uimanager.b<T> & h<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public g(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void a(T t10, String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1742453971:
                if (str.equals("thumbColor")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -287374307:
                if (str.equals("trackTintColor")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3551:
                if (str.equals("on")) {
                    c10 = 3;
                    break;
                }
                break;
            case 111972721:
                if (str.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    c10 = 4;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1084662482:
                if (str.equals("trackColorForFalse")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2113632767:
                if (str.equals("trackColorForTrue")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((h) this.f15748a).setThumbColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 1:
                ((h) this.f15748a).setEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 2:
                ((h) this.f15748a).setTrackTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 3:
                ((h) this.f15748a).setOn(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 4:
                ((h) this.f15748a).setValue(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((h) this.f15748a).setDisabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((h) this.f15748a).setTrackColorForFalse(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 7:
                ((h) this.f15748a).setThumbTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case '\b':
                ((h) this.f15748a).setTrackColorForTrue(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            default:
                super.a(t10, str, obj);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void b(T t10, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((h) this.f15748a).setNativeValue(t10, readableArray.getBoolean(0));
        }
    }
}
