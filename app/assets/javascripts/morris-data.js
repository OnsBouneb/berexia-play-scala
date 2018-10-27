$(function() {

    Morris.Area({
        element: 'data-area-chart',
        data: [{
            Day: '01-01-2010', 
            Numberofcall: 1141233,
            TrafficVolume: 49386802,
            AverageCallDuration: 43.0
        }, {
            Day: '02-01-2010',  
            Numberofcall: 810207,
            TrafficVolume: 35546231,
            AverageCallDuration: 44.0
        }, {
            Day: '03-01-2010',  
            Numberofcall: 804721,
            TrafficVolume: 34507750,
            AverageCallDuration: 43.0
        }, {
            Day: '04-01-2010',   
            Numberofcall: 796071,
            TrafficVolume: 34637055,
            AverageCallDuration: 44.0
        }, {
            Day: '05-01-2010',   
            Numberofcall: 786020,
            TrafficVolume: 34783398,
            AverageCallDuration: 44.0
        }, {
            Day: '06-01-2010',  
            Numberofcall: 773388,
            TrafficVolume: 34363071,
            AverageCallDuration: 44.0
        }, {
            Day: '07-01-2010',   
            Numberofcall: 801969,
            TrafficVolume: 34865830,
            AverageCallDuration: 43.0
        }, {
            Day: '08-01-2010',   
            Numberofcall: 770831,
            TrafficVolume: 33967847,
            AverageCallDuration: 44.0
        }, {
            Day: '09-01-2010',     
            Numberofcall: 841048,
            TrafficVolume: 37507977,
            AverageCallDuration: 45.0
        }, {
             Day: '10-01-2010',           
            Numberofcall: 844591,
            TrafficVolume: 38461411,
            AverageCallDuration: 46.0
        }, {
            Day: '11-01-2010',     
            Numberofcall: 796155,
            TrafficVolume: 36102596,
            AverageCallDuration: 45.0
        }, { 
            Day: '12-01-2010',                
            Numberofcall: 804048,
            TrafficVolume: 37337090,
            AverageCallDuration: 46.0
        }, { 
            Day: '13-01-2010',                  
            Numberofcall: 795679,
            TrafficVolume: 36707054,
            AverageCallDuration: 46.0
        }, {                                    
            Day: '14-01-2010',                
            Numberofcall: 804681,
            TrafficVolume: 36502847,
            AverageCallDuration: 45.0
        }, { 
            Day: '15-01-2010',                
            Numberofcall: 784225,
            TrafficVolume: 36824631,
            AverageCallDuration: 47.0
        }, { 
            Day: '16-01-2010',               
            Numberofcall: 785515,
            TrafficVolume: 33920323,
            AverageCallDuration: 43.0
        }, { 
            Day: '17-01-2010',               
            Numberofcall: 775203,
            TrafficVolume: 33378791,
            AverageCallDuration: 43.0
        }, { 
            Day: '18-01-2010',                 
            Numberofcall: 745222,
            TrafficVolume: 32915024,
            AverageCallDuration: 44.0 
        }, { 
            Day: '19-01-2010',        
            Numberofcall: 726309,
            TrafficVolume: 31990413,
            AverageCallDuration: 44.0 
        }, { 
            Day: '20-01-2010',                
            Numberofcall: 749081,
            TrafficVolume: 33298324,
            AverageCallDuration: 44.0
        }, { 
            Day: '21-01-2010',                
            Numberofcall: 787731,
            TrafficVolume: 35040143,
            AverageCallDuration: 44.0
        }, { 
            Day: '22-01-2010',                
            Numberofcall: 798657,
            TrafficVolume: 35853940,
            AverageCallDuration: 45.0
        }, { 
            Day: '23-01-2010',                  
            Numberofcall: 959800,
            TrafficVolume: 42350145,
            AverageCallDuration: 44.0
        }, { 
            Day: '24-01-2010',                           
            Numberofcall: 876718,
            TrafficVolume: 37752645,
            AverageCallDuration: 43.0
        }, { 
            Day: '25-01-2010',                 
            Numberofcall: 805523,
            TrafficVolume: 35233510,
            AverageCallDuration: 44.0
        }, { 
            Day: '26-01-2010',                
            Numberofcall: 794057,
            TrafficVolume: 35745947,
            AverageCallDuration: 45.0
        }, { 
            Day: '27-01-2010',                 
            Numberofcall: 804817,
            TrafficVolume: 36432811,
            AverageCallDuration: 45.0
        }, { 
            Day: '28-01-2010',                
            Numberofcall: 799438,
            TrafficVolume: 35656347,
            AverageCallDuration: 45.0
        }, { 
            Day: '29-01-2010',                
            Numberofcall: 341017,
            TrafficVolume: 14794040,
            AverageCallDuration: 43.0 
        }],
        xkey: 'Day',
        ykeys: ['Numberofcall', 'TrafficVolume', 'AverageCallDuration'],
        labels: ['Numberofcall', 'TrafficVolume(s)', 'AverageCallDuration(s)'],
        pointSize: 2,
        hideHover: 'auto',
        resize: true
    });

    Morris.Donut({
        element: 'data1-donut-chart',
        data: [{
            label: "Numberofcall",
            value: 12359868
        }, {
            label: "TrafficVolume(s)",
            value: 551711326
        }, {
            label: "AverageCallDuration(s)",
            value: 43
        }],
        resize: true
    });

Morris.Donut({
        element: 'data2-donut-chart',
        data: [{
            label: "Numberofcall",
            value: 10749088
        }, {
            label: "TrafficVolume(s)",
            value: 474362403
        }, {
            label: "AverageCallDuration(s)",
            value: 42
        }],
        resize: true
    });

    Morris.Bar({
        element: 'morris-bar-chart',
        data: [{
            y: '2012',
            a: 620000 ,
b : 10000
        }, {
            y: '2013',
            a: 610000 ,
b: 210000
        }, {
            y: '2014',
            a: 400000 ,
b: 100000
        }, {
            y: '2015',
            a: 410000 , b: 50000
        }, {
            y: '2016',
            a: 420000 , b: 300000
        }, {
            y: '2017',
            a: 380000 , b: 200000
        }, {
            y: '2018',
            a:  360000 , b: 250000
        },
{
            y: '2019',
            a:  450000 , b: 2000
        }],
        xkey: 'y',
        ykeys: ['a', 'b'],
        labels: [ 'Nombre d"abonnés', 'churners'],
        hideHover: 'auto',
        resize: true
    });

});
