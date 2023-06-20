package com.brentvatne.exoplayer;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewGroupManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.inmobi.media.jh;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import da.h0;
import ea.n0;
import fm.castbox.mediation.BuildConfig;
import h6.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ReactExoplayerViewManager extends ViewGroupManager<g> {
    private static final String PROP_BACK_BUFFER_DURATION_MS = "backBufferDurationMs";
    private static final String PROP_BUFFER_CONFIG = "bufferConfig";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = "bufferForPlaybackAfterRebufferMs";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS = "bufferForPlaybackMs";
    private static final String PROP_BUFFER_CONFIG_MAX_BUFFER_MS = "maxBufferMs";
    private static final String PROP_BUFFER_CONFIG_MAX_HEAP_ALLOCATION_PERCENT = "maxHeapAllocationPercent";
    private static final String PROP_BUFFER_CONFIG_MIN_BACK_BUFFER_MEMORY_RESERVE_PERCENT = "minBackBufferMemoryReservePercent";
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MEMORY_RESERVE_PERCENT = "minBufferMemoryReservePercent";
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MS = "minBufferMs";
    private static final String PROP_CONTENT_START_TIME = "contentStartTime";
    private static final String PROP_CONTROLS = "controls";
    private static final String PROP_DISABLE_BUFFERING = "disableBuffering";
    private static final String PROP_DISABLE_DISCONNECT_ERROR = "disableDisconnectError";
    private static final String PROP_DISABLE_FOCUS = "disableFocus";
    private static final String PROP_DRM = "drm";
    private static final String PROP_DRM_HEADERS = "headers";
    private static final String PROP_DRM_LICENSESERVER = "licenseServer";
    private static final String PROP_DRM_TYPE = "type";
    private static final String PROP_FULLSCREEN = "fullscreen";
    private static final String PROP_HIDE_SHUTTER_VIEW = "hideShutterView";
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";
    private static final String PROP_MIN_LOAD_RETRY_COUNT = "minLoadRetryCount";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";
    private static final String PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK = "preventsDisplaySleepDuringVideoPlayback";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";
    private static final String PROP_RESIZE_MODE = "resizeMode";
    private static final String PROP_SECURE_VIEW = "useSecureView";
    private static final String PROP_SEEK = "seek";
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";
    private static final String PROP_SRC = "src";
    private static final String PROP_SRC_HEADERS = "requestHeaders";
    private static final String PROP_SRC_TYPE = "type";
    private static final String PROP_SRC_URI = "uri";
    private static final String PROP_TEXT_TRACKS = "textTracks";
    private static final String PROP_USE_TEXTURE_VIEW = "useTextureView";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RCTVideo";
    private e config;

    public ReactExoplayerViewManager(e eVar) {
        this.config = eVar;
    }

    private int convertToIntDef(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return h.a(Integer.parseInt(str));
    }

    private boolean startsWithValidScheme(String str) {
        return str.startsWith("http://") || str.startsWith("https://") || str.startsWith("content://") || str.startsWith("file://") || str.startsWith("asset://");
    }

    public static Map<String, String> toStringMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (keySetIterator.hasNextKey()) {
            HashMap hashMap = new HashMap();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                hashMap.put(nextKey, readableMap.getString(nextKey));
            }
            return hashMap;
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        String[] strArr;
        e.b a10 = h6.e.a();
        for (String str : i.f9194c) {
            a10.b(str, h6.e.d("registrationName", str));
        }
        return a10.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return h6.e.g("ScaleNone", Integer.toString(0), "ScaleAspectFit", Integer.toString(0), "ScaleToFill", Integer.toString(3), "ScaleAspectFill", Integer.toString(4));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.a(name = PROP_MIN_LOAD_RETRY_COUNT)
    public void minLoadRetryCount(g gVar, int i10) {
        gVar.A1(i10);
    }

    @w6.a(defaultInt = 0, name = PROP_BACK_BUFFER_DURATION_MS)
    public void setBackBufferDurationMs(g gVar, int i10) {
        gVar.n1(i10);
    }

    @w6.a(name = PROP_BUFFER_CONFIG)
    public void setBufferConfig(g gVar, ReadableMap readableMap) {
        if (readableMap != null) {
            gVar.o1(readableMap.hasKey(PROP_BUFFER_CONFIG_MIN_BUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_MIN_BUFFER_MS) : 50000, readableMap.hasKey(PROP_BUFFER_CONFIG_MAX_BUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_MAX_BUFFER_MS) : 50000, readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) : IronSourceConstants.IS_INSTANCE_NOT_FOUND, readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) : jh.DEFAULT_BITMAP_TIMEOUT, readableMap.hasKey(PROP_BUFFER_CONFIG_MAX_HEAP_ALLOCATION_PERCENT) ? readableMap.getDouble(PROP_BUFFER_CONFIG_MAX_HEAP_ALLOCATION_PERCENT) : 1.0d, readableMap.hasKey(PROP_BUFFER_CONFIG_MIN_BACK_BUFFER_MEMORY_RESERVE_PERCENT) ? readableMap.getDouble(PROP_BUFFER_CONFIG_MIN_BACK_BUFFER_MEMORY_RESERVE_PERCENT) : 0.0d, readableMap.hasKey(PROP_BUFFER_CONFIG_MIN_BUFFER_MEMORY_RESERVE_PERCENT) ? readableMap.getDouble(PROP_BUFFER_CONFIG_MIN_BUFFER_MEMORY_RESERVE_PERCENT) : 0.0d);
        }
    }

    @w6.a(defaultInt = 0, name = PROP_CONTENT_START_TIME)
    public void setContentStartTime(g gVar, int i10) {
        gVar.p1(i10);
    }

    @w6.a(defaultBoolean = false, name = PROP_CONTROLS)
    public void setControls(g gVar, boolean z10) {
        gVar.q1(z10);
    }

    @w6.a(name = PROP_DRM)
    public void setDRM(g gVar, ReadableMap readableMap) {
        if (readableMap == null || !readableMap.hasKey("type")) {
            return;
        }
        String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
        String string2 = readableMap.hasKey(PROP_DRM_LICENSESERVER) ? readableMap.getString(PROP_DRM_LICENSESERVER) : null;
        ReadableMap map = readableMap.hasKey(PROP_DRM_HEADERS) ? readableMap.getMap(PROP_DRM_HEADERS) : null;
        if (string == null || string2 == null || n0.V(string) == null) {
            return;
        }
        gVar.w1(n0.V(string));
        gVar.v1(string2);
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                arrayList.add(nextKey);
                arrayList.add(map.getString(nextKey));
            }
            gVar.u1((String[]) arrayList.toArray(new String[0]));
        }
        gVar.S1(false);
    }

    @w6.a(defaultBoolean = false, name = PROP_DISABLE_BUFFERING)
    public void setDisableBuffering(g gVar, boolean z10) {
        gVar.r1(z10);
    }

    @w6.a(defaultBoolean = false, name = PROP_DISABLE_DISCONNECT_ERROR)
    public void setDisableDisconnectError(g gVar, boolean z10) {
        gVar.s1(z10);
    }

    @w6.a(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public void setDisableFocus(g gVar, boolean z10) {
        gVar.t1(z10);
    }

    @w6.a(defaultBoolean = false, name = PROP_FULLSCREEN)
    public void setFullscreen(g gVar, boolean z10) {
        gVar.x1(z10);
    }

    @w6.a(defaultBoolean = false, name = PROP_HIDE_SHUTTER_VIEW)
    public void setHideShutterView(g gVar, boolean z10) {
        gVar.y1(z10);
    }

    @w6.a(name = PROP_MAXIMUM_BIT_RATE)
    public void setMaxBitRate(g gVar, int i10) {
        gVar.z1(i10);
    }

    @w6.a(defaultBoolean = false, name = PROP_MUTED)
    public void setMuted(g gVar, boolean z10) {
        gVar.B1(z10);
    }

    @w6.a(defaultBoolean = false, name = PROP_PAUSED)
    public void setPaused(g gVar, boolean z10) {
        gVar.C1(z10);
    }

    @w6.a(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public void setPlayInBackground(g gVar, boolean z10) {
        gVar.D1(z10);
    }

    @w6.a(defaultBoolean = false, name = PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK)
    public void setPreventsDisplaySleepDuringVideoPlayback(g gVar, boolean z10) {
        gVar.F1(z10);
    }

    @w6.a(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public void setProgressUpdateInterval(g gVar, float f10) {
        gVar.G1(f10);
    }

    @w6.a(name = PROP_TEXT_TRACKS)
    public void setPropTextTracks(g gVar, ReadableArray readableArray) {
        gVar.R1(readableArray);
    }

    @w6.a(name = PROP_RATE)
    public void setRate(g gVar, float f10) {
        gVar.H1(f10);
    }

    @w6.a(defaultBoolean = false, name = PROP_REPEAT)
    public void setRepeat(g gVar, boolean z10) {
        gVar.J1(z10);
    }

    @w6.a(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public void setReportBandwidth(g gVar, boolean z10) {
        gVar.K1(z10);
    }

    @w6.a(name = PROP_RESIZE_MODE)
    public void setResizeMode(g gVar, String str) {
        gVar.L1(convertToIntDef(str));
    }

    @w6.a(name = PROP_SEEK)
    public void setSeek(g gVar, float f10) {
        gVar.m1(Math.round(f10 * 1000.0f));
    }

    @w6.a(name = PROP_SELECTED_AUDIO_TRACK)
    public void setSelectedAudioTrack(g gVar, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey(AppMeasurementSdk.ConditionalUserProperty.VALUE) ? readableMap.getDynamic(AppMeasurementSdk.ConditionalUserProperty.VALUE) : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        gVar.M1(r0, dynamic);
    }

    @w6.a(name = PROP_SELECTED_TEXT_TRACK)
    public void setSelectedTextTrack(g gVar, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey(AppMeasurementSdk.ConditionalUserProperty.VALUE) ? readableMap.getDynamic(AppMeasurementSdk.ConditionalUserProperty.VALUE) : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        gVar.N1(r0, dynamic);
    }

    @w6.a(name = PROP_SELECTED_VIDEO_TRACK)
    public void setSelectedVideoTrack(g gVar, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey(AppMeasurementSdk.ConditionalUserProperty.VALUE) ? readableMap.getDynamic(AppMeasurementSdk.ConditionalUserProperty.VALUE) : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        gVar.P1(r0, dynamic);
    }

    @w6.a(name = PROP_SRC)
    public void setSrc(g gVar, ReadableMap readableMap) {
        Uri buildRawResourceUri;
        Context applicationContext = gVar.getContext().getApplicationContext();
        String string = readableMap.hasKey(PROP_SRC_URI) ? readableMap.getString(PROP_SRC_URI) : null;
        String string2 = readableMap.hasKey("type") ? readableMap.getString("type") : null;
        Map<String, String> stringMap = readableMap.hasKey(PROP_SRC_HEADERS) ? toStringMap(readableMap.getMap(PROP_SRC_HEADERS)) : null;
        if (TextUtils.isEmpty(string)) {
            gVar.N0();
        } else if (startsWithValidScheme(string)) {
            Uri parse = Uri.parse(string);
            if (parse != null) {
                gVar.Q1(parse, string2, stringMap);
            }
        } else {
            int identifier = applicationContext.getResources().getIdentifier(string, "drawable", applicationContext.getPackageName());
            if (identifier == 0) {
                identifier = applicationContext.getResources().getIdentifier(string, "raw", applicationContext.getPackageName());
            }
            if (identifier <= 0 || (buildRawResourceUri = h0.buildRawResourceUri(identifier)) == null) {
                return;
            }
            gVar.I1(buildRawResourceUri, string2);
        }
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = PROP_USE_TEXTURE_VIEW)
    public void setUseTextureView(g gVar, boolean z10) {
        gVar.S1(z10);
    }

    @w6.a(defaultFloat = 1.0f, name = PROP_VOLUME)
    public void setVolume(g gVar, float f10) {
        gVar.T1(f10);
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = PROP_SECURE_VIEW)
    public void useSecureView(g gVar, boolean z10) {
        gVar.a2(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
        return new g(n0Var, this.config);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(g gVar) {
        gVar.K0();
    }
}
