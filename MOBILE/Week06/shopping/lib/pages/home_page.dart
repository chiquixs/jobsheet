import 'package:flutter/material.dart';
import 'package:shopping/models/item.dart';
import 'package:shopping/widgets/item_card.dart';
import 'package:go_router/go_router.dart';

class HomePage extends StatelessWidget {
  HomePage({super.key});

  final List<Item> items = [
    Item(
      name: 'Sugar',
      price: 5000,
      image: 'assets/images/sugar.jpeg',
      stock: 10,
      rating: 4.5,
    ),
    Item(
      name: 'Salt',
      price: 2000,
      image: 'assets/images/salt.jpeg',
      stock: 5,
      rating: 4.0,
    ),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Shopping List')),

      body: Padding(
        padding: const EdgeInsets.all(8),
        child: GridView.builder(
          itemCount: items.length,
          gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
            crossAxisCount: 2,
            crossAxisSpacing: 10,
            mainAxisSpacing: 10,
            childAspectRatio: 0.7,
          ),
          itemBuilder: (context, index) {
            final item = items[index];

            return InkWell(
              onTap: () {
                context.push('/item', extra: item); 
              },
              child: ItemCard(item: item),
            );
          },
        ),
      ),

      // 🧾 FOOTER
      bottomNavigationBar: Container(
        padding: const EdgeInsets.all(10),
        child: const Text(
          'Nama: Nafisa Chiquita | NIM: 244107060020',
          textAlign: TextAlign.center,
        ),
      ),
    );
  }
}