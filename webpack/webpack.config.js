const path = require('path');

module.exports = {
    entry: {
        t3d: './src/entry.js',
        t3d_utils: './src/entry1.js'
    },
    output: {
        path: path.resolve(__dirname, '../libs'),
        filename: '[name].js'
    },	
    devServer: {
        publicPath: '/dist',
        port: 3001
    },
    //mode: 'development'
    mode: 'production'
};
//string = 'production': 'none' | 'development' | 'production'