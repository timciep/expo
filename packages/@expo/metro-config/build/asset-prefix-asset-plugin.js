'use strict';
function appendAssetPrefix(path, assetPrefix = process.env._EXPO_METRO_ASSET_PREFIX) {
    if (assetPrefix) {
        return `/${assetPrefix.replace(/^\/+/, '').replace(/\/$/, '')}${path}`;
    }
    return path;
}
module.exports = function assetPrefixAssetPlugin(asset) {
    asset.httpServerLocation = appendAssetPrefix(asset.httpServerLocation);
    asset.doesStuff = true;
    console.log('asset >', process.env._EXPO_METRO_ASSET_PREFIX, asset);
    return asset;
};
