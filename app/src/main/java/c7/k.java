package c7;

import android.view.View;
import c7.l;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: SliderManagerDelegate.java */
/* loaded from: classes.dex */
public class k<T extends View, U extends com.facebook.react.uimanager.b<T> & l<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public k(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.a1
    public void a(T t10, String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1900655011:
                if (str.equals("maximumTrackTintColor")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1736983259:
                if (str.equals("thumbImage")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1021497397:
                if (str.equals("minimumTrackTintColor")) {
                    c10 = 3;
                    break;
                }
                break;
            case -981448432:
                if (str.equals("maximumTrackImage")) {
                    c10 = 4;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3540684:
                if (str.equals("step")) {
                    c10 = 6;
                    break;
                }
                break;
            case 111972721:
                if (str.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    c10 = 7;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 718061361:
                if (str.equals("maximumValue")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1139400400:
                if (str.equals("trackImage")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1192487427:
                if (str.equals("minimumValue")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1333596542:
                if (str.equals("minimumTrackImage")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((l) this.f15748a).setMaximumTrackTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 1:
                ((l) this.f15748a).setThumbImage(t10, (ReadableMap) obj);
                return;
            case 2:
                ((l) this.f15748a).setEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 3:
                ((l) this.f15748a).setMinimumTrackTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            case 4:
                ((l) this.f15748a).setMaximumTrackImage(t10, (ReadableMap) obj);
                return;
            case 5:
                ((l) this.f15748a).setTestID(t10, obj == null ? "" : (String) obj);
                return;
            case 6:
                ((l) this.f15748a).setStep(t10, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            case 7:
                ((l) this.f15748a).setValue(t10, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            case '\b':
                ((l) this.f15748a).setDisabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\t':
                ((l) this.f15748a).setMaximumValue(t10, obj == null ? 1.0d : ((Double) obj).doubleValue());
                return;
            case '\n':
                ((l) this.f15748a).setTrackImage(t10, (ReadableMap) obj);
                return;
            case 11:
                ((l) this.f15748a).setMinimumValue(t10, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            case '\f':
                ((l) this.f15748a).setMinimumTrackImage(t10, (ReadableMap) obj);
                return;
            case '\r':
                ((l) this.f15748a).setThumbTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                return;
            default:
                super.a(t10, str, obj);
                return;
        }
    }
}
