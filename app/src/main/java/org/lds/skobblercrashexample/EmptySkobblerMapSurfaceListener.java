package org.lds.skobblercrashexample;

import android.graphics.Bitmap;

import com.skobbler.ngx.map.SKAnnotation;
import com.skobbler.ngx.map.SKCoordinateRegion;
import com.skobbler.ngx.map.SKMapCustomPOI;
import com.skobbler.ngx.map.SKMapPOI;
import com.skobbler.ngx.map.SKMapSurfaceListener;
import com.skobbler.ngx.map.SKMapViewHolder;
import com.skobbler.ngx.map.SKPOICluster;
import com.skobbler.ngx.map.SKScreenPoint;

// Skobbler doesn't check to see if the map surface listener is null before calling methods,
// so we set the listener to an instance of this class when we don't want to listen to updates
public class EmptySkobblerMapSurfaceListener implements SKMapSurfaceListener {
    @Override
    public void onActionPan() {
        //do nothing
    }

    @Override
    public void onActionZoom() {
        //do nothing
    }

    @Override
    public void onSurfaceCreated(SKMapViewHolder skMapViewHolder) {
        //do nothing
    }

    @Override
    public void onMapRegionChanged(SKCoordinateRegion skCoordinateRegion) {
        //do nothing
    }

    @Override
    public void onMapRegionChangeStarted(SKCoordinateRegion skCoordinateRegion) {
        //do nothing
    }

    @Override
    public void onMapRegionChangeEnded(SKCoordinateRegion skCoordinateRegion) {
        //do nothing
    }

    @Override
    public void onDoubleTap(SKScreenPoint skScreenPoint) {
        //do nothing
    }

    @Override
    public void onSingleTap(SKScreenPoint skScreenPoint) {
        //do nothing
    }

    @Override
    public void onRotateMap() {
        //do nothing
    }

    @Override
    public void onLongPress(SKScreenPoint skScreenPoint) {
        //do nothing
    }

    @Override
    public void onInternetConnectionNeeded() {
        //do nothing
    }

    @Override
    public void onMapActionDown(SKScreenPoint skScreenPoint) {
        //do nothing
    }

    @Override
    public void onMapActionUp(SKScreenPoint skScreenPoint) {
        //do nothing
    }

    @Override
    public void onPOIClusterSelected(SKPOICluster skpoiCluster) {
        //do nothing
    }

    @Override
    public void onMapPOISelected(SKMapPOI skMapPOI) {
        //do nothing
    }

    @Override
    public void onAnnotationSelected(SKAnnotation skAnnotation) {
        //do nothing
    }

    @Override
    public void onCustomPOISelected(SKMapCustomPOI skMapCustomPOI) {
        //do nothing
    }

    @Override
    public void onCompassSelected() {
        //do nothing
    }

    @Override
    public void onCurrentPositionSelected() {
        //do nothing
    }

    @Override
    public void onObjectSelected(int i) {
        //do nothing
    }

    @Override
    public void onInternationalisationCalled(int i) {
        //do nothing
    }

    @Override
    public void onDebugInfo(double v, float v1, double v2) {
        //do nothing
    }

    @Override
    public void onBoundingBoxImageRendered(int i) {
        //do nothing
    }

    @Override
    public void onGLInitializationError(String s) {
        //do nothing
    }

    @Override
    public void onScreenshotReady(Bitmap bitmap) {
        //do nothing
    }
}
