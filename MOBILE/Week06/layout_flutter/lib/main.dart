import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    Color color = Theme.of(context).primaryColor;

    Widget buttonSection = Row(
    mainAxisAlignment: MainAxisAlignment.spaceEvenly,
    children: [
    _buildButtonColumn(color, Icons.call, 'CALL'),
    _buildButtonColumn(color, Icons.near_me, 'ROUTE'),
    _buildButtonColumn(color, Icons.share, 'SHARE'),
  ],
);
    Widget textSection = Container(
      padding: const EdgeInsets.all(32),
      child: const Text(
        'Gunung Rinjani adalah gunung berapi aktif setinggi sekitar 3.726 meter yang terletak di Pulau Lombok, Provinsi Nusa Tenggara Barat, dan termasuk dalam kawasan Taman Nasional Gunung Rinjani. Gunung ini terkenal dengan keindahan alamnya seperti Danau Segara Anak yang berada di dalam kaldera, pemandangan savana, serta panorama matahari terbit yang memukau, sehingga menjadi salah satu destinasi favorit para pendaki, meskipun jalurnya cukup menantang dan memerlukan persiapan fisik serta perlengkapan yang matang.\n\n'
        'Nama : Nafisa Chiquita Finandra Putri\n'
        'NIM : 244107060020\n',
        textAlign: TextAlign.justify,
        softWrap: true,

      ),
    );
    Widget titleSection = Container(
      padding: const EdgeInsets.all(32),
      child: Row(
        children: [
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Container(
                  padding: const EdgeInsets.only(bottom: 8),
                  child: const Text(
                    'Wisata Gunung di Lombok',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
                const Text(
                  'Pulau Lombok, Provinsi Nusa Tenggara Barat (NTB)',
                  style: TextStyle(
                    color: Colors.grey,
                  ),
                ),
              ],
            ),
          ),
          Column(
            children: [
              const Icon(
                Icons.star,
                color: Colors.red,
              ),
            ],
          ),
              const Text('41'),
        ],
      ),
    );

    return MaterialApp(
      title: 'Flutter layout: Nafisa Chiquita Finandra Putri 244107060020',
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Flutter layout demo'),
        ),
        body: ListView(
          children: [
            Image.asset(
              'assets/rinjani.jpeg',
              width: 600,
              height: 240,
              fit: BoxFit.cover,
            ),
            titleSection,
            buttonSection,
            textSection,
          ],
        ), // GANTI DI SINI
      ),
    );
  }

   Column _buildButtonColumn(Color color, IconData icon, String label) {
    return Column(
      mainAxisSize: MainAxisSize.min,
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Icon(icon, color: color),
        Container(
          margin: const EdgeInsets.only(top: 8),
          child: Text(
            label,
            style: TextStyle(
              fontSize: 12,
              fontWeight: FontWeight.w400,
              color: color,
            ),
          ),
        ),
      ],
    );
  }
}