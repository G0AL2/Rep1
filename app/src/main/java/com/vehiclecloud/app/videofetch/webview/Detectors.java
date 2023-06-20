package com.vehiclecloud.app.videofetch.webview;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import ob.e;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Detectors {
    private static Detectors instance;
    private final List<Detector> detectors = new LinkedList();
    private static final byte[] SCRIPT_START = "<script>".getBytes();
    private static final byte[] SCRIPT_END = "</script>".getBytes();

    /* loaded from: classes3.dex */
    private static final class ContainDetector extends Detector {
        private final String key;

        public ContainDetector(String str, byte[] bArr) {
            super(bArr);
            this.key = str;
        }

        @Override // com.vehiclecloud.app.videofetch.webview.Detectors.Detector
        boolean match(String str) {
            return str.contains(this.key);
        }
    }

    /* loaded from: classes3.dex */
    private static abstract class Detector {
        final byte[] injectJs;

        public Detector(byte[] bArr) {
            this.injectJs = bArr;
        }

        abstract boolean match(String str);
    }

    /* loaded from: classes3.dex */
    private static final class PatternDetector extends Detector {
        private final Pattern pattern;

        public PatternDetector(String str, byte[] bArr) {
            super(bArr);
            this.pattern = Pattern.compile(str);
        }

        @Override // com.vehiclecloud.app.videofetch.webview.Detectors.Detector
        boolean match(String str) {
            return this.pattern.matcher(str).matches();
        }
    }

    public Detectors(String str) {
        Detector containDetector;
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("fns");
            JSONObject jSONObject3 = jSONObject.getJSONObject("detectors");
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject4 = jSONObject3.getJSONObject(next);
                JSONArray jSONArray = jSONObject4.getJSONArray("detector");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(SCRIPT_START);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    if (string.startsWith("$")) {
                        string = jSONObject2.getString(string.substring(1));
                    }
                    byteArrayOutputStream.write(string.getBytes());
                }
                byteArrayOutputStream.write(SCRIPT_END);
                List<Detector> list = this.detectors;
                if (jSONObject4.has("pattern")) {
                    containDetector = new PatternDetector(jSONObject4.getString("pattern"), byteArrayOutputStream.toByteArray());
                } else {
                    containDetector = new ContainDetector(next, byteArrayOutputStream.toByteArray());
                }
                list.add(containDetector);
            }
        } catch (Exception e10) {
            Log.e("Detectors", "parse detector get ex.", e10);
        }
    }

    static Detectors getInstance() {
        if (instance == null) {
            instance = new Detectors(com.google.firebase.remoteconfig.a.r(e.n()).s("detector"));
        }
        return instance;
    }

    byte[] detectorOf(String str) {
        for (Detector detector : this.detectors) {
            if (detector.match(str)) {
                return detector.injectJs;
            }
        }
        return null;
    }
}
