package i6;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;

/* compiled from: ReadableMapBufferSoLoader.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f31545a = false;

    public static void a() {
        if (f31545a) {
            return;
        }
        com.facebook.systrace.a.c(0L, "ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
        SoLoader.p("mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
        com.facebook.systrace.a.g(0L);
        f31545a = true;
    }
}
