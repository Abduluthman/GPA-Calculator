#include <iostream>
#include <vector>
using namespace std;
int main(){
//  Defining data elements to be used in program
    double noOfScores;
    vector<double> score;
    vector<double> weight;
    double numerator = 0;
    double denominator = 0;

//  Taking User Input
    cout << "How Many Scores Would You Be Entering: ";
    cin >> noOfScores;
    
    for (int i = 0; i < noOfScores; i++){
        double placeHolderScore;
        double placeHolderWeight;
        cout << "Enter The Score Of Course " << i + 1 << ": ";
        cin >> placeHolderScore;
//      Assigning Grades
        if (placeHolderScore >= 70 && placeHolderScore <= 100) {
            placeHolderScore = 4;
        }
        else if (placeHolderScore >= 60 && placeHolderScore < 70) {
            placeHolderScore = 3;
        }
        else if (placeHolderScore >= 50 && placeHolderScore < 60) {
            placeHolderScore = 2;
        }
        else if (placeHolderScore >= 35 && placeHolderScore < 50) {
            placeHolderScore = 1;
        }
        else if (placeHolderScore >= 0 && placeHolderScore < 35) {
            placeHolderScore = 0;
        } 
        else {
            cout << "Invalid Score" << endl;
        }
        score.push_back(placeHolderScore);

        cout << "Enter The Weight Of The Course " << i + 1 << ": ";
        cin >> placeHolderWeight;
        weight.push_back(placeHolderWeight);
    }

    for (int i = 0; i < score.size(); i++){
        cout << "Course " << i + 1 << endl;
        cout << "Score: " << score[i] << endl;
        cout << "Weight: " << weight[i] << endl;
        cout << endl;
//      Accumulate the weighted sum
        numerator += score[i] * weight[i];
    }

    for (int i = 0; i < weight.size(); i++){
        denominator += weight[i];
    }
    double weightedAverage = numerator / denominator;
    cout << "Cummilative Grade Point Average: " << weightedAverage;
}

