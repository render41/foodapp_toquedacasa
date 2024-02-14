package com.arcastudio.foodapp_toquedacasa.models.data

import com.arcastudio.foodapp_toquedacasa.R

object FoodObject {
    val starterFoodList = listOf(
        FoodData(
            R.drawable.food_starter_french_fries,
            "Batata Frita",
            "Batatas cortadas em palitos e fritas.",
            20,
            10.99
        ),
        FoodData(
            R.drawable.food_starter_bruschetta,
            "Bruschetta de Tomate e Manjericão",
            "Fatias de pão italiano grelhado cobertas com tomates frescos, manjericão, alho e azeite de oliva.",
            10,
            12.50
        ),
        FoodData(
            R.drawable.food_starter_onion_soup,
            "Sopa de Cebola Gratinada",
            "Uma sopa de cebola caramelizada coberta com queijo Gruyère derretido e croutons crocantes.",
            30,
            18.75
        ),
        FoodData(
            R.drawable.food_starter_shrimp,
            "Camarão à Provençal",
            "Camarões suculentos salteados em alho, tomate, vinho branco e ervas provençais.",
            20,
            24.99
        )
    )

    val lunchFoodList = listOf(
        FoodData(
            R.drawable.food_lunch_chicken_strogonoff,
            "Strogonoff de Frango",
            "Frango desfiado cozido em um molho cremoso de creme de leite e tomate, geralmente servido com arroz branco e batata palha.",
            40,
            18.99
        ),
        FoodData(
            R.drawable.food_lunch_carbonara,
            "Espaguete à Carbonara",
            "Espaguete cozido al dente, misturado com bacon crocante, queijo parmesão, ovos e pimenta preta moída.",
            25,
            22.50
        ),
        FoodData(
            R.drawable.food_lunch_feijoada,
            "Feijoada",
            "Prato típico brasileiro, feito com feijão preto cozido com carne de porco, linguiça, bacon e outras carnes, geralmente servido com arroz branco, couve refogada, laranja e farofa.",
            180,
            29.99
        ),
        FoodData(
            R.drawable.food_lunch_caesar_salad,
            "Salada Caesar com Frango Grelhado",
            "Salada de alface romana, croutons, queijo parmesão ralado e peito de frango grelhado, servida com molho Caesar.",
            20,
            15.99
        )
    )

    val drinksList = listOf(
        FoodData(
            R.drawable.drink_coffee,
            "Café",
            "Uma bebida quente feita a partir de grãos de café torrados, geralmente servida com ou sem leite.",
            5,
            3.99
        ),
        FoodData(
            R.drawable.drink_soda,
            "Refrigerante",
            "Uma bebida gaseificada e adoçada, disponível em uma variedade de sabores.",
            10,
            2.50
        ),
        FoodData(
            R.drawable.drink_orange_juice,
            "Suco de Laranja",
            "Suco natural de laranjas espremidas, geralmente servido gelado.",
            5,
            4.99
        ),
        FoodData(
            R.drawable.drink_smoothie,
            "Smoothie de Frutas",
            "Uma bebida cremosa feita a partir de frutas frescas ou congeladas, geralmente misturadas com iogurte ou leite.",
            6,
            6.50
        )
    )

    val dessertsList = listOf(
        FoodData(
            R.drawable.dessert_cake,
            "Bolo de Chocolate",
            "Um bolo de chocolate rico e úmido, geralmente coberto com glacê ou creme de chocolate.",
            30,
            15.99
        ),
        FoodData(
            R.drawable.dessert_ice_cream,
            "Sorvete",
            "Um doce gelado feito a partir de leite ou creme, disponível em uma variedade de sabores.",
            10,
            7.50
        ),
        FoodData(
            R.drawable.dessert_cheesecake,
            "Cheesecake de Morango",
            "Uma torta cremosa feita de cream cheese, servida com cobertura de morango.",
            45,
            20.75
        ),
        FoodData(
            R.drawable.dessert_fruit_salad,
            "Salada de Frutas",
            "Uma mistura refrescante de frutas frescas, como morangos, uvas, melão e kiwi.",
            15,
            9.99
        )
    )

}