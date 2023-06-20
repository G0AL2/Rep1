package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;

/* loaded from: classes.dex */
class EventAnimationDriver implements RCTEventEmitter {
    private List<String> mEventPath;
    s mValueNode;

    public EventAnimationDriver(List<String> list, s sVar) {
        this.mEventPath = list;
        this.mValueNode = sVar;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        List<String> list;
        ReadableArray array;
        if (writableMap != null) {
            ReadableArray readableArray = null;
            for (int i11 = 0; i11 < this.mEventPath.size() - 1; i11++) {
                if (writableMap != null) {
                    String str2 = this.mEventPath.get(i11);
                    ReadableType type = writableMap.getType(str2);
                    if (type == ReadableType.Map) {
                        writableMap = writableMap.getMap(str2);
                        readableArray = null;
                    } else if (type == ReadableType.Array) {
                        array = writableMap.getArray(str2);
                        readableArray = array;
                        writableMap = null;
                    } else {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type + " for key '" + str2 + "'");
                    }
                } else {
                    int parseInt = Integer.parseInt(this.mEventPath.get(i11));
                    ReadableType type2 = readableArray.getType(parseInt);
                    if (type2 == ReadableType.Map) {
                        writableMap = readableArray.getMap(parseInt);
                        readableArray = null;
                    } else if (type2 == ReadableType.Array) {
                        array = readableArray.getArray(parseInt);
                        readableArray = array;
                        writableMap = null;
                    } else {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for index '" + parseInt + "'");
                    }
                }
            }
            String str3 = this.mEventPath.get(list.size() - 1);
            if (writableMap != null) {
                this.mValueNode.f15333f = writableMap.getDouble(str3);
                return;
            }
            this.mValueNode.f15333f = readableArray.getDouble(Integer.parseInt(str3));
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }
}
